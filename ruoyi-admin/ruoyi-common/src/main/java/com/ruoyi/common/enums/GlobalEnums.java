package com.ruoyi.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 常用枚举
 *
 * @author 高明希
 */
public class GlobalEnums {

    /**
     * 用户角色
     */
    public enum CustomerRoles {

        ADMIN("ADMIN", "主账号");

        private String kwType;
        private String kwName;

        CustomerRoles(String kwType, String kwName) {
            this.kwType = kwType;
            this.kwName = kwName;
        }

        public static String getEnumByCode(String kwType) {
            if (StringUtils.isNotBlank(kwType)) {
                for (CustomerRoles locType : CustomerRoles.values()) {
                    if (locType.getKwType().equals(kwType)) {
                        return locType.getKwName();
                    }
                }
            }
            return null;
        }

        public String getKwType() {
            return kwType;
        }

        public String getKwName() {
            return kwName;
        }
    }

    /**
     * 冻结状态
     */
    public enum FreezeStatus {

        UNFREEZE("0", "未冻结"), FREEZE("1", "冻结");

        private String kwType;
        private String kwName;

        FreezeStatus(String kwType, String kwName) {
            this.kwType = kwType;
            this.kwName = kwName;
        }

        public static String getEnumByCode(String kwType) {
            if (StringUtils.isNotBlank(kwType)) {
                for (FreezeStatus locType : FreezeStatus.values()) {
                    if (locType.getKwType().equals(kwType)) {
                        return locType.getKwName();
                    }
                }
            }
            return null;
        }

        public String getKwType() {
            return kwType;
        }

        public String getKwName() {
            return kwName;
        }
    }

    public enum FukuanType {

        NORM("00", "标准户"), AIR_CONDITIONER("01", "空调户"), DEPOSIT_03("03", "押金户"), DEPOSIT_07("07", "押金户"), FINANCE_98("98", "金融户"), FINANCE_99("99", "金融户");

        private String kwType;
        private String kwName;

        FukuanType(String kwType, String kwName) {
            this.kwType = kwType;
            this.kwName = kwName;
        }

        public static String getEnumByCode(String kwType) {
            if (StringUtils.isNotBlank(kwType)) {
                for (FukuanType locType : FukuanType.values()) {
                    if (locType.getKwType().equals(kwType)) {
                        return locType.getKwName();
                    }
                }
            }
            return null;
        }

        public String getKwType() {
            return kwType;
        }

        public String getKwName() {
            return kwName;
        }
    }

    public enum WarehouseStatus {

        MAIN("0", "主仓"), ASSIST("1", "辅仓");

        private String kwType;
        private String kwName;

        WarehouseStatus(String kwType, String kwName) {
            this.kwType = kwType;
            this.kwName = kwName;
        }

        public static String getEnumByCode(String kwType) {
            if (StringUtils.isNotBlank(kwType)) {
                for (WarehouseStatus locType : WarehouseStatus.values()) {
                    if (locType.getKwType().equals(kwType)) {
                        return locType.getKwName();
                    }
                }
            }
            return null;
        }

        public String getKwType() {
            return kwType;
        }

        public String getKwName() {
            return kwName;
        }
    }

    public enum BrandType {

        Haier("000", "海尔"), Casarte("051", "卡萨帝"), TongShuai("089", "统帅"),
        STLS("030", "海尔施特劳斯\n");

        private String kwType;
        private String kwName;

        BrandType(String kwType, String kwName) {
            this.kwType = kwType;
            this.kwName = kwName;
        }

        public static String getEnumByCode(String kwType) {
            if (StringUtils.isNotBlank(kwType)) {
                for (BrandType locType : BrandType.values()) {
                    if (locType.getKwType().equals(kwType)) {
                        return locType.getKwName();
                    }
                }
            }
            return null;
        }

        public String getKwType() {
            return kwType;
        }

        public String getKwName() {
            return kwName;
        }
    }

    public enum StoreType {

        NOTHING("0", "无门店"), EXIST("1", "有门店"), CLOSE("2", "闭店");

        private String kwType;
        private String kwName;

        StoreType(String kwType, String kwName) {
            this.kwType = kwType;
            this.kwName = kwName;
        }

        public static String getEnumByCode(String kwType) {
            if (StringUtils.isNotBlank(kwType)) {
                for (StoreType locType : StoreType.values()) {
                    if (locType.getKwType().equals(kwType)) {
                        return locType.getKwName();
                    }
                }
            }
            return null;
        }

        public String getKwType() {
            return kwType;
        }

        public String getKwName() {
            return kwName;
        }
    }

    public enum ProductUnitType {

        TAI("TAI", "台"), TAO("TAO", "套");

        private String kwType;
        private String kwName;

        ProductUnitType(String kwType, String kwName) {
            this.kwType = kwType;
            this.kwName = kwName;
        }

        public static String getEnumByCode(String kwType) {
            if (StringUtils.isNotBlank(kwType)) {
                for (ProductUnitType locType : ProductUnitType.values()) {
                    if (locType.getKwType().equals(kwType)) {
                        return locType.getKwName();
                    }
                }
            }
            return null;
        }

        public String getKwType() {
            return kwType;
        }

        public String getKwName() {
            return kwName;
        }
    }

}
