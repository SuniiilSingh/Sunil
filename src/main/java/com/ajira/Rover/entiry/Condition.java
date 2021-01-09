package com.ajira.Rover.entiry;

/**
 *
 */
    public class Condition{
        public String type;
        public String property;
        public String operator;
        public Object value;

        public Condition() {
        }

        public Condition(String type, String property, String operator, Object value) {
            this.type = type;
            this.property = property;
            this.operator = operator;
            this.value = value;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public String getOperator() {
            return operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }


