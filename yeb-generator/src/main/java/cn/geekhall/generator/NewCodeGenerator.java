package cn.geekhall.generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.fill.Property;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * NewCodeGenerator.java
 *
 * @author yiny
 */
public class NewCodeGenerator {

    public static void main(String[] args) {
        List<String> includes = new ArrayList<String>();
        includes.add("t_admin");
        includes.add("t_admin_role");
        includes.add("t_appraise");
        includes.add("t_department");
        includes.add("t_employee");
        includes.add("t_employee_ec");
        includes.add("t_employee_remove");
        includes.add("t_employee_train");
        includes.add("t_joblevel");
        includes.add("t_mail_log");
        includes.add("t_menu");
        includes.add("t_menu_role");
        includes.add("t_nation");
        includes.add("t_oplog");
        includes.add("t_politics_status");
        includes.add("t_position");
        includes.add("t_role");
        includes.add("t_salary");
        includes.add("t_salary_adjust");
        includes.add("t_sys_msg");
        includes.add("t_sys_msg_content");

        new StrategyConfig.Builder()
                .entityBuilder()
//                .superClass(BaseEntity.class)
                .disableSerialVersionUID()
                .enableChainModel()
                .enableLombok()
                .enableRemoveIsPrefix()
                .enableTableFieldAnnotation()
                .enableActiveRecord()
                .versionColumnName("version")
                .versionPropertyName("version")
                .logicDeleteColumnName("deleted")
                .logicDeletePropertyName("deleteFlag")
                .naming(NamingStrategy.no_change)
                .columnNaming(NamingStrategy.underline_to_camel)
                .addSuperEntityColumns("id", "created_by", "created_time", "updated_by", "updated_time")
//                .addIgnoreColumns("age")
                .addTableFills(new Column("create_time", FieldFill.INSERT))
                .addTableFills(new Property("updateTime", FieldFill.INSERT_UPDATE))
                .idType(IdType.AUTO)
                .formatFileName("%sEntity")
                .build();

        FastAutoGenerator.create("jdbc:mysql://localhost:3316/db_yeb?userUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "yeb", "123456")
                .globalConfig(builder -> {
                    builder.author("yiny") // ????????????
                            .enableSwagger() // ?????? swagger ??????
                            .fileOverride() // ?????????????????????
                            .outputDir(System.getProperty("user.dir") + "/yeb-generator/src/main/java"); // ??????????????????
                })
                .packageConfig(builder -> {
                    builder.parent("cn.geekhall") // ???????????????
                            .moduleName("server") // ?????????????????????
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml,
                                    System.getProperty("user.dir") + "/yeb-generator/src/main/resources/mapper")); // ??????mapperXml????????????
                })
                .strategyConfig(builder -> {
                    builder.addInclude(includes) // ???????????????????????????
                            .addTablePrefix("t_"); // ?????????????????????
                })
                .templateEngine(new FreemarkerTemplateEngine()) // ??????Freemarker???????????????????????????Velocity????????????
                .execute();
    }
}
