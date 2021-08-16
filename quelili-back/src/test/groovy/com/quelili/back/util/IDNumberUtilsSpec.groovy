package com.quelili.back.util

import spock.lang.Specification
import spock.lang.Unroll

class IDNumberUtilsSpec extends Specification{

    @Unroll
    def "身份证号:#idNo 的生日,性别,年龄是:#result"() {
        expect: "when + then 组合"
        IDNumberUtils.getBirAgeSex(idNo) == result

        where: "表格方式测试不同的分支逻辑"
        idNo                 || result
        "310168199809187333" || ["birthday": "1998-09-18", "sex": "男", "age": "23"]
        "320168200212084268" || ["birthday": "2002-12-08", "sex": "女", "age": "19"]
        "330168199301214267" || ["birthday": "1993-01-21", "sex": "女", "age": "28"]
        "411281870628201"    || ["birthday": "1987-06-28", "sex": "男", "age": "34"]
        "427281730307862"    || ["birthday": "1973-03-07", "sex": "女", "age": "48"]
        "479281691111377"    || ["birthday": "1969-11-11", "sex": "男", "age": "52"]
    }
}
