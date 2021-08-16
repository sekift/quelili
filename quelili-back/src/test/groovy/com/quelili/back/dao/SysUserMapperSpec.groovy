package com.quelili.back.dao

import com.quelili.back.util.MyBatisUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Unroll

@Narrative( value = """
    SysUser测试
"""
)
@SpringBootTest
class SysUserMapperSpec extends Specification{

    @Autowired
    private SysUserMapper sysUserMapper;

    def "按ID查数据=selectByPrimaryKey id：#id 返回结果： #result"() {
        expect: "when + then 组合"
        sysUserMapper.selectByPrimaryKey(id) == result

        where: "表格方式测试不同的分支逻辑"
        id || result
        1||""
    }
}
