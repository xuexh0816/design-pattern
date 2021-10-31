package factory_pattern;

import com.create.factory_pattern.Shape;
import com.create.factory_pattern.ShapeFactory;
import com.create.factory_pattern.ShapeType;

/**
 * @author Xue_Xionghui
 * @time 2021-10-31 19:10
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFac = new ShapeFactory();
        Shape circle = shapeFac.getShape(ShapeType.CIRCLE);
        circle.draw();

        Shape rectangle = shapeFac.getShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape square = shapeFac.getShape(ShapeType.SQUARE);
        square.draw();

    }
}
