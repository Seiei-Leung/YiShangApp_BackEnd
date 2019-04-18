package top.seiei.gmerp.dao;

import top.seiei.gmerp.bean.ProofingPlan;

import java.util.List;

public interface ProofingPlanMapper {
    int insert(ProofingPlan record);

    int insertSelective(ProofingPlan record);

    List<ProofingPlan> selectByBillno(String billno);

    List<String> selectBillnoGroupByBillno();

}