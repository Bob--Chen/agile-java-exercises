package pieces;

public class Piece {
    enum Colour {
        WHITE,
        BLACK
    }

    enum Type {
        PAWN("p"),
        KNIGHT("n"),
        ROOK("r"),
        KING("k"),
        QUEEN("q"),
        BISHOP("b");

        String name;

        private Type(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }
    }

    private static int whitePiecesInUse = 0;
    private static int blackPiecesInUse = 0;

    Colour colour;
    Type type;

    private Piece(Colour colour, Type type) {
        this.colour = colour;
        this.type = type;
    }

    /**
     * Create piece of colour
     * @param colour
     * @param type
     */
    private static Piece create(Colour colour, Type type) {
        if (colour == Colour.WHITE) {
            whitePiecesInUse++;
        } else {
            blackPiecesInUse++;
        }
        return new Piece(colour, type);
    }

    public static Piece createWhitePawn()
    {
        return create(Colour.WHITE, Type.PAWN);
    }
    public static Piece createWhiteRook()
    {
        return create(Colour.WHITE, Type.ROOK);
    }
    public static Piece createWhiteKing()
    {
        return create(Colour.WHITE, Type.KING);
    }
    public static Piece createWhiteQueen()
    {
        return create(Colour.WHITE, Type.QUEEN);
    }
    public static Piece createWhiteBishop()
    {
        return create(Colour.WHITE, Type.BISHOP);
    }
    public static Piece createWhiteKnight()
    {
        return create(Colour.WHITE, Type.KNIGHT);
    }

    public static Piece createBlackPawn()
    {
        return create(Colour.BLACK, Type.PAWN);
    }
    public static Piece createBlackRook()
    {
        return create(Colour.BLACK, Type.ROOK);
    }
    public static Piece createBlackKing()
    {
        return create(Colour.BLACK, Type.KING);
    }
    public static Piece createBlackQueen()
    {
        return create(Colour.BLACK, Type.QUEEN);
    }
    public static Piece createBlackBishop()
    {
        return create(Colour.BLACK, Type.BISHOP);
    }
    public static Piece createBlackKnight()
    {
        return create(Colour.BLACK, Type.KNIGHT);
    }

    public static void resetCount() {
        whitePiecesInUse = 0;
        blackPiecesInUse = 0;
    }

    public boolean isWhite() {
        return colour == Colour.WHITE;
    }

    public boolean isBlack() {
        return !isWhite();
    }

    public static int getPiecesInUse() {
        return whitePiecesInUse+blackPiecesInUse;
    }

    public static int getNumberOfWhitePieces() {
        return whitePiecesInUse;
    }


    public static int getNumberOfBlackPieces() {
        return blackPiecesInUse;
    }

    /**
     * Get colour of piece.
     * @return
     */
    public Colour getColour() {
        return colour;
    }

    public String toString() {
        if (this.isWhite()) {
            return type.getName().toUpperCase();
        }
        return type.getName();
    }

}
