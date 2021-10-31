package com.create.factory_pattern;

/**
 * @author Xue_Xionghui
 * @time 2021-10-31 19:02
 */
public class ShapeFactory {
    public Shape getShape(ShapeType shapeType){

        if (shapeType == null){
            return null;
        }
        if ("CIRCLE".equalsIgnoreCase(String.valueOf(shapeType))){
            return new Circle();
        }else if ("SQUARE".equalsIgnoreCase(String.valueOf(shapeType))){
            return new Square();
        }else if ("RECTANGLE".equalsIgnoreCase(String.valueOf(shapeType))){
            return new Rectangle();
        }
        return null;
    }
}
