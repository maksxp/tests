enum Operation{
    SUM{
        public int test (int x, int y) {
            return x+y;
        }
        public String test1 (int x, int y) {
            return x+y+"rrr";
        }
    },
    SUBTRACT{
        public int test (int x, int y) {
            return x-y;
        }
        public String test1 (int x, int y) {
            return x-y+"rrr";
        }
    },
    MULTIPLY{
        public int test (int x, int y) {
            return x*y;
        }
        public String test1 (int x, int y) {
            return x*y+"rrrr";
        }
    },
    TEST {
        public String test1 (int x, int y) {
            return x+" rrr"+y;
        }
        public int test (int x, int y) {
            return x+y;
        }
    };
    public abstract int test(int x, int y);
    public abstract String test1(int x, int y);
}