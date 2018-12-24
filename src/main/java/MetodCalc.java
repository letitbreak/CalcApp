class MetodCalc {
    int calc(int n1, String op, int n2) {
        int res;
        switch (op) {
            case "+":
                res = n1+n2;
                break;
            case "-":
                res = n1-n2;
                break;
            case "*":
                res = n1*n2;
                break;
            case "/":
                res = n1/n2;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }
}