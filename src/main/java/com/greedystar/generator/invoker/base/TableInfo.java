package com.greedystar.generator.invoker.base;

import com.greedystar.generator.entity.ColumnInfo;

import java.util.List;

public class TableInfo {
    private String tableName;
    private String tableRemark;
    private List<ColumnInfo> columnInfos;

    public TableInfo(String tableName, String tableRemark, List<ColumnInfo> columnInfos) {
        this.tableName = tableName;
        this.tableRemark = tableRemark;
        this.columnInfos = columnInfos;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableRemark() {
        return tableRemark;
    }

    public void setTableRemark(String tableRemark) {
        this.tableRemark = tableRemark;
    }

    public List<ColumnInfo> getColumnsInfo() {
        return columnInfos;
    }

    public void setColumnInfos(List<ColumnInfo> columnInfos) {
        this.columnInfos = columnInfos;
    }
}
