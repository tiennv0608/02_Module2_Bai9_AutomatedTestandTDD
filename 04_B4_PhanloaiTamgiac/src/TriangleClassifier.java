public class TriangleClassifier {
    String triangleClassifier(int side1, int side2, int side3) {
        String result = "";
        if (side1 == 0 || side2 == 0 || side3 == 0) {
            result = "Khong la tam giac";
        } else {
            if (side1 == side2) {
                if (side1 == side3) {
                    result = "Tam giac deu";
                } else {
                    result = "Tam giac can";
                }
            } else if (side1 == side3) {
                result = "Tam giac can";
            } else {
                if (side2 == side3) {
                    result = "Tam giac can";
                } else {
                    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                        if ((side1 * side1 + side2 * side2 == side3 * side3) ||
                                (side2 * side2 + side3 * side3 == side1 * side1) ||
                                (side1 * side1 + side3 * side3 == side2 * side2)) {
                            result = "Tam giac vuong";
                        } else {
                            result = "Tam giac thuong";
                        }
                    } else {
                        result = "Khong la tam giac";
                    }
                }
            }
        }
        return result;
    }
}
