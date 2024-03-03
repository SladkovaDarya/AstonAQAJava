public class Main {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        String[][] arrValid = new String[][]
                {{"11", "22", "33", "44"}, {"55", "66", "77", "88"},
                        {"11", "22", "33", "44"}, {"55", "66", "77", "88"}};
        String[][] arrInvalidSize = new String[][]
                {{"11", "22", "33", "44"}, {"55", "66", "77", "88"}};
        String[][] arrInvalidFormat = new String[][]
                {{"11", "22", "aa", "44"}, {"55", "bb", "77", "88"},
                        {"11", "22", "33", "44"}, {"55", "66", "77", "88"}};
        try {
            myArray(arrValid);
            myArray(arrInvalidSize);
        } catch (MyArrayDataException | MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            myArray(arrInvalidFormat);
        } catch (MyArrayDataException | MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void myArray(String[][] myArray) throws MyArraySizeException, MyArrayDataException {
        if (myArray.length != SIZE ||
                myArray[0].length != SIZE ||
                myArray[1].length != SIZE ||
                myArray[2].length != SIZE ||
                myArray[3].length != SIZE) {
            throw new MyArraySizeException("Некорректный размер массива");
        }
        int sumArr = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    int value = Integer.parseInt(myArray[i][j]);
                    sumArr += value;
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException("Некорректный формат данных в ячейке массива номер "
                            + "[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                }
            }
        }
        System.out.println("Сумма всех элементов массива равна " + sumArr);
    }
}