package top.seiei.gmerp.service;
import top.seiei.gmerp.vo.MissionListVO;
import java.util.Date;
import java.util.ArrayList;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import top.seiei.gmerp.bean.ProofingPlan;
import top.seiei.gmerp.common.ServerResponse;
import top.seiei.gmerp.dao.EmployeeMapper;
import top.seiei.gmerp.dao.ProofingColorMapper;
import top.seiei.gmerp.dao.ProofingPlanMapper;
import top.seiei.gmerp.vo.MissionVO;

import javax.annotation.Resource;
import java.util.List;

@Service("proodingPlanService")
public class ProofingPlanService {

    @Resource
    private ProofingPlanMapper proofingPlanMapper;

    @Resource
    private ProofingColorMapper proofingColorMapper;

    @Resource
    private EmployeeMapper employeeMapper;

    /**
     * 分页获取打样信息
     * @param pageIndex 起始页
     * @param pageSize 查询页数
     * @return PageInfo 对象
     */
    public ServerResponse getByPageNum(Integer pageIndex, Integer pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        List<String> billnoList = proofingPlanMapper.selectBillnoGroupByBillno();
        PageInfo pageInfo = new PageInfo(billnoList);
        List<MissionVO> missionVOList = new ArrayList<>();
        for (String item : billnoList) {
            MissionVO missionVO = assembleMissionVO(item);
            if (missionVO != null) {
                missionVOList.add(missionVO);
            }
        }
        pageInfo.setList(missionVOList);
        return  ServerResponse.createdBySuccess(pageInfo);
    }

    /**
     * 根据打样 ID 获取对应的颜色
     * @param serialno 打样 ID
     * @return 是否获取到对应颜色
     */
    public ServerResponse getColorBySerialno(String serialno) {
        List<String> colorList = proofingColorMapper.selectColorBySerialno(serialno);
        if (colorList.size() == 0) {
            return ServerResponse.createdByError("查无对应颜色号");
        }
        return ServerResponse.createdBySuccess(colorList);
    }

    /**
     * 获取变更人员的信息
     * @return 返回名称字符串
     */
    public ServerResponse getEmployeeName() {
        return ServerResponse.createdBySuccess(employeeMapper.selectName());
    }

    private MissionVO assembleMissionVO(String billNo) {
        List<ProofingPlan> proofingPlanList = proofingPlanMapper.selectByBillno(billNo);
        if (proofingPlanList.size() == 0) {
            return null;
        }
        ProofingPlan proofingPlan = proofingPlanList.get(0);
        MissionVO missionVO = new MissionVO();
        missionVO.setSerialno(proofingPlan.getSerialno());
        missionVO.setBillNo(billNo);
        missionVO.setCustName(proofingPlanList.get(0).getCustname());
        missionVO.setType(proofingPlan.getType());
        missionVO.setDeadLine(proofingPlan.getDeadline());
        missionVO.setProductName(proofingPlan.getProductname());
        missionVO.setSize1(proofingPlan.getSize1());
        missionVO.setSize2(proofingPlan.getSize2());
        missionVO.setSize3(proofingPlan.getSize3());
        missionVO.setSize4(proofingPlan.getSize4());
        missionVO.setSize5(proofingPlan.getSize5());
        missionVO.setSize6(proofingPlan.getSize6());
        missionVO.setSize7(proofingPlan.getSize7());
        missionVO.setSize8(proofingPlan.getSize8());
        missionVO.setSize9(proofingPlan.getSize9());
        missionVO.setSize10(proofingPlan.getSize10());
        missionVO.setBillDate(proofingPlan.getBilldate());
        missionVO.setStyleNo(proofingPlan.getStyleno());
        missionVO.setProductclassification(proofingPlan.getProductclassification());
        missionVO.setSeason(proofingPlan.getSeason());
        missionVO.setSeries(proofingPlan.getSeries());
        missionVO.setMaterialname(proofingPlan.getMaterialname());
        missionVO.setQuantity(proofingPlan.getQuantity());
        missionVO.setImageurl(proofingPlan.getImageurl());
        List<MissionListVO> missionListVOS = new ArrayList<>();
        for (ProofingPlan item : proofingPlanList) {
            MissionListVO missionListVO = new MissionListVO();
            missionListVO.setNodeName(item.getNodename());
            missionListVO.setTechnicalpattern(item.getTechnicalpattern());
            missionListVO.setTechnicalpatterndt(item.getTechnicalpatterndt());
            missionListVO.setTechnicalpatternrealdt(item.getTechnicalpatternrealdt());
            missionListVOS.add(missionListVO);
        }
        missionVO.setMissionList(missionListVOS);
        return missionVO;
    }
}
