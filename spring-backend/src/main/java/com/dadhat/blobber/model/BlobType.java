package com.dadhat.blobber.model;

public enum BlobType {

        JSON(JsonBlob.class, "JsonBlob");


        String name;
        Class classObject;
        BlobType(Class classObject, String name) {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Class getClassObject() {
            return classObject;
        }

        public void setClassObject(Class classObject) {
            this.classObject = classObject;
        }


}
