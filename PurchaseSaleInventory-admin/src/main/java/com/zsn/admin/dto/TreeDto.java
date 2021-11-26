package com.zsn.admin.dto;

/*    */
/*    */ 
/*    */ 
/*    */ public class TreeDto
/*    */ {
    /*    */   private Integer id;
    /*    */   private Integer pId;
    /*    */   private String name;
    /* 10 */   private Boolean checked = Boolean.valueOf(false);

    /*    */
    /*    */
    public Integer getId() {
        /* 13 */
        return this.id;
        /*    */
    }

    /*    */
    /*    */
    public void setId(Integer id) {
        /* 17 */
        this.id = id;
        /*    */
    }

    /*    */
    /*    */
    public Integer getpId() {
        /* 21 */
        return this.pId;
        /*    */
    }

    /*    */
    /*    */
    public void setpId(Integer pId) {
        /* 25 */
        this.pId = pId;
        /*    */
    }

    /*    */
    /*    */
    public String getName() {
        /* 29 */
        return this.name;
        /*    */
    }

    /*    */
    /*    */
    public void setName(String name) {
        /* 33 */
        this.name = name;
        /*    */
    }

    /*    */
    /*    */
    public Boolean getChecked() {
        /* 37 */
        return this.checked;
        /*    */
    }

    /*    */
    /*    */
    public void setChecked(Boolean checked) {
        /* 41 */
        this.checked = checked;
        /*    */
    }

}

/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\dto\TreeDto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */