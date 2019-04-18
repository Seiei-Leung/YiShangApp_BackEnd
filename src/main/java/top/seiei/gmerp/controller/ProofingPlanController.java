package top.seiei.gmerp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.seiei.gmerp.common.ServerResponse;
import top.seiei.gmerp.service.ProofingPlanService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/api/proodingplan/")
@CrossOrigin(origins = "http://127.0.0.1:8020", maxAge = 3600)
public class ProofingPlanController {

    @Resource
    private ProofingPlanService proofingPlanService;

    /**
     * 分页获取打样信息
     * @param session session 对象
     * @param pageindex 起始页
     * @param pagesize 查询页数
     * @return PageInfo 对象
     */
    @RequestMapping(value = "getbypagenum", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse getByPageNum(HttpSession session, Integer pageindex, Integer pagesize) {
        return proofingPlanService.getByPageNum(pageindex, pagesize);
    }

    /**
     * 根据打样 ID 获取对应的颜色
     * @param serialno 打样 ID
     * @return 是否获取到对应颜色
     */
    @RequestMapping(value = "getColorBySerialno", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse getColorBySerialno(String serialno) {
        return proofingPlanService.getColorBySerialno(serialno);
    }

    /**
     * 获取变更人员的名称列表
     * @return 名称列表
     */
    @RequestMapping(value = "getName")
    @ResponseBody
    public ServerResponse getName() {
        return proofingPlanService.getEmployeeName();
    }
}
