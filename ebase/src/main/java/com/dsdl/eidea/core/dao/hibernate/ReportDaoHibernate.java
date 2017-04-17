package com.dsdl.eidea.core.dao.hibernate;

import com.dsdl.eidea.core.dao.ReportDao;
import com.dsdl.eidea.core.entity.po.ReportPo;
import com.dsdl.eidea.core.entity.union.MsgUnion;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 车东明 on 2017/4/17.
 */
@Repository
public class ReportDaoHibernate extends BaseDaoHibernate<ReportPo, String> implements ReportDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<MsgUnion> selectLabelTrl(String lang) {
        return sqlSessionTemplate.selectList("com.delmar.core.mybatis.sql.MessageAndLabelUnionMapper.selectLabelTrl", lang);
    }

    @Override
    public List<MsgUnion> selectMessageTrl(String lang) {
        return sqlSessionTemplate.selectList("com.delmar.core.mybatis.sql.MessageAndLabelUnionMapper.selectMessageTrl", lang);
    }
}
