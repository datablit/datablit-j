package org.c2stack.meta;

/**
 *
 */
public class Leaf extends MetaBase implements Leafable {
    private String description;
    private DataType type;
    private boolean config;
    private boolean mandatory;

    public Leaf(String ident) {
        super(ident);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDataType(DataType type) {
        this.type = type;
    }

    public DataType getDataType() {
        return type;
    }

    public void setConfig(boolean config) {
        this.config = config;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }
}
