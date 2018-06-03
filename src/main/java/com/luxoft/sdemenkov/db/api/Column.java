package com.luxoft.sdemenkov.db.api;

import java.util.Objects;

public class Column {
    private String columnName;
    private String columnValue;

    public Column(String columnName, String columnValue) {
        this.columnName = columnName;
        this.columnValue = columnValue;
    }

    public Column() {
    }

    public String getColumnName() {
        return columnName;
    }

    public String getColumnValue() {
        return columnValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Column column = (Column) o;
        return Objects.equals(columnName, column.columnName) &&
                Objects.equals(columnValue, column.columnValue);
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }

    @Override
    public int hashCode() {

        return Objects.hash(columnName, columnValue);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Column{");
        sb.append("columnName='").append(columnName).append('\'');
        sb.append(", columnValue='").append(columnValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
