package Parcels;

/**
 * @Discription In this class, only 3 objects are created and the constructor is set as private to avoid creating new objects
 */
public class Parcel {
    private int length,height,width,value;
    private int[][][] size;

    private Parcel(int length, int width, int height, int value) {
        this.length = length;
        this.height = height;
        this.width = width;

        size = new int[length][width][height];
        initialization(size);
    }

    private static final Parcel A_PARCEL = new Parcel(2, 2, 4, 3);
    private static final Parcel B_PARCEL = new Parcel(2, 3, 4, 4);
    private static final Parcel C_PARCEL = new Parcel(3, 3, 3, 5);

    /**
    * @Description Set the elements in array to 1
    * @param size
    */
    public final void initialization(int[][][] size){
        for(int i = 0; i < size.length; i++){
            for(int j = 0; j < size[0].length; j++){
                for(int w = 0; w < size[0][0].length; w++){
                    size[i][j][w] = 1;
                }
            }
        }
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getValue() {
        return value;
    }

    public int[][][] getSize() {
        return size;
    }

    public static Parcel getaParcel() {
        return A_PARCEL;
    }

    public static Parcel getbParcel() {
        return B_PARCEL;
    }

    public static Parcel getcParcel() {
        return C_PARCEL;
    }

}
