import Parcels.Parcel;

/**
 * only on object is created in this class
 */
public class Container {

    Location toAdd = null;

    private static final int LENGTH = 33;
    private static final int WIDTH = 5;
    private static final int Height = 8;
    private int[][][] shape;
    //Using the following way to access Parcel class(This is just an example, you can delete it if you want)
    Parcel aParcel = Parcel.getaParcel();
    Parcel bParcel = Parcel.getbParcel();
    Parcel cParcel = Parcel.getcParcel();
    //it is possible to get the array(or length or height) by following(This is just an example, you can delete it if you want)
    int[][][] a = aParcel.getSize();
    int lengthOfA = aParcel.getLength();
    

    //The following is to create only one object

    private Container(){
        shape = new int[LENGTH][WIDTH][Height];
        setDefault(shape);
    }

    private static Container instance = new Container();

    public static Container getInstance(){
        return instance;
    }

    public void add(Location myLocation, Parcel parcel){

    }
    /**
     * Set everything in array as -1
     * @param shape
     */
    public void setDefault(int[][][] shape) {
        for(int i = 0; i < shape.length; i++){
            for(int j = 0; j < shape[0].length; j++){
                for(int w = 0; w < shape[0][0].length; w++){
                    shape[i][j][w] = -1;
                }
            }
        }
    }



    public static int getHeight() {
        return Height;
    }
    public static int getLength() {
        return LENGTH;
    }
    public int[][][] getShape() {
        return shape;
    }
    public static int getWidth() {
        return WIDTH;
    }
}
