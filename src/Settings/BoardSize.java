package Settings;

public class BoardSize {

    private Integer boardPieceRate = 2;
    private Integer x = (boardPieceRate * 8);
    private Integer y = (boardPieceRate * 8);

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getPieceRate() {
        return this.boardPieceRate;
    }
}
