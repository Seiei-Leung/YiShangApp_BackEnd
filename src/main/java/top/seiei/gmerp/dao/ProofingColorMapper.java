package top.seiei.gmerp.dao;

import top.seiei.gmerp.bean.ProofingColor;

import java.util.List;

public interface ProofingColorMapper {
    int deleteByPrimaryKey(String guid);

    int insert(ProofingColor record);

    int insertSelective(ProofingColor record);

    ProofingColor selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(ProofingColor record);

    int updateByPrimaryKey(ProofingColor record);

    List<String> selectColorBySerialno(String serialno);
}