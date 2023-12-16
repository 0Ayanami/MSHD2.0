package net.lab1024.sa.admin.module.system.earthquake.domain.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.lab1024.sa.common.common.enumeration.CarrierEnum;
import net.lab1024.sa.common.common.util.SmartVerificationUtil;
import net.lab1024.sa.common.common.validator.enumeration.CheckEnum;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class EarthquakeAddForm {
    @ApiModelProperty("一体化编码")
    @NotNull(message = "编码不能为空")
    @Size(min = 36, max = 36, message = "编码为固定长度36位")
    private String Code;

    @ApiModelProperty("发生的地点")
    @NotNull(message = "发生的地点不能为空")
    @Length(max = 100, message = "发生的地点最大长度为100")
    private String Location;

    @ApiModelProperty("发生的时间")
    @NotNull(message = "发生的时间不能为空")
    @Pattern(regexp = SmartVerificationUtil.DATE_TIME, message = "时间格式不正确")
    private String Time;

    @ApiModelProperty("数据来源大类")
    @NotNull(message = "数据来源大类不能为空")
    @Length(max = 50, message = "数据来源最大长度为50")
    private String Source;

    @ApiModelProperty("数据来源子类")
    @NotNull(message = "数据来源子类不能为空")
    @Length(max = 50, message = "数据来源子类最大长度为50")
    private String subSource;

    @ApiModelProperty("载体")
    @NotNull(message = "载体不能为空")
    @CheckEnum(value = CarrierEnum.class, message = "载体错误")
    private String Carrier;

    @ApiModelProperty("灾情大类")
    @NotNull(message = "灾情大类不能为空")
    @Length(max = 50, message = "灾情大类最大长度为50")
    private String disaster;

    @ApiModelProperty("灾情子类")
    @NotNull(message = "灾情子类不能为空")
    @Length(max = 50, message = "灾情子类最大长度为50")
    private String subdisaster;

    @ApiModelProperty("灾情指标")
    @NotNull(message = "灾情指标不能为空")
    @Length(max = 20, message = "灾情指标最大长度为20")
    private String index;

}
