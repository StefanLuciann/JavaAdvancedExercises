package AdvancedLiveCodingex5;

/**
 * Implement the Validator interface,
 * which will include a boolean validate(Parcel input) method in its declaration.
 * Create a Parcel class with the parameters: • int xLength • int yLength • int zLength • float weight • boolean isExpress
 * The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is not less than 30
 * , whether the weight does not exceed 30.0 for
 * isExpress = false or 15.0 for isExpress = true. In case of errors, it should inform the user about them.
 */
public class Main {
    public static void main(String[] args) {
        Parcel parcelExpressOK = new Parcel(33,35,55,14,true);
        Parcel parcelExpressNotOK = new Parcel(33,35,55,18f,true);
        Parcel parcelNotExpressButOk = new Parcel(33,35,55,28f,false);
        Parcel parcelNotExpressNotOk = new Parcel(33,35,55,36,false);
        Parcel parcelOfLengthsNotOk = new Parcel(3,8888,55,16,false);

        Validator<Parcel> validator = new ParcelValidator();

        System.out.println(validator.validate(parcelExpressOK));
        System.out.println(validator.validate(parcelExpressNotOK));
        System.out.println(validator.validate(parcelNotExpressNotOk));
        System.out.println(validator.validate(parcelOfLengthsNotOk));
    }
}
