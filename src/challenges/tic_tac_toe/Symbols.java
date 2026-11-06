package src.challenges.tic_tac_toe;

public enum Symbols {
    X() {
        @Override
        public String getValue() {
            return "X";
        }

        @Override
        public Symbols next() {
            return O;
        }
    }, O() {
        @Override
        public String getValue() {
            return "O";
        }

        @Override
        public Symbols next() {
            return X;
        }
    }, E() {
        @Override
        public String getValue() {
            return "-";
        }

        @Override
        public Symbols next() {
            return X;
        }
    };

    public abstract String getValue();
    public abstract Symbols next();
}
