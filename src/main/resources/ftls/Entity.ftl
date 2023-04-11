package ${Configuration.packageName}.${Configuration.path.entity};

<#if Configuration.lombokEnable>
import lombok.Data;
</#if>
<#if Configuration.mybatisPlusEnable>
import com.baomidou.mybatisplus.annotation.*;
<#elseif Configuration.jpaEnable>
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
</#if>
import java.io.Serializable;
import java.util.Date;

/**
 * ${Remarks}
 * table: ${TableName}
 * @author ${Configuration.author}
 * @date ${.now?date}
 */
<#if Configuration.lombokEnable>
@Data
</#if>
<#if Configuration.mybatisPlusEnable>
@TableName(value = "${TableName}")
<#elseif Configuration.jpaEnable>
@Entity
@Table(name = "${TableName}")
</#if>
public class ${ClassName} implements Serializable {
    ${Properties}

    ${Methods}
}