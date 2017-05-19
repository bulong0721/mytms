package org.mytms.adempiere.dto;

/**
 * Created by Martin.Xu on 2017/5/12.
 */
public enum ShowType {
    ID("ID"),
    Radio("radio"),
    Number("number"),
    Datetime("datetime"),
    Switch("switch"),
    Select("select"),
    Cascader("cascader"),
    Placeholder("placeholder"),
    Actions("actions"),
    Collapse("collapse"),
    AutoComplete("autoComplete"),
    Image("image"),
    Input("input");
    private String type;

    ShowType(String type) {
        this.type = type;
    }

    public String getValue() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
