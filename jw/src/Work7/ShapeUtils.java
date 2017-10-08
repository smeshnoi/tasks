package Work7;

/**
 * Created by User on 08.10.2017.
 */
public class ShapeUtils {
        public static boolean isRectangle(Point rectangle) {
            return rectangle instanceof Rectangle;
        }

        public static boolean isTriangle(Point triangle) {
            return triangle instanceof Triangle;
        }
}
