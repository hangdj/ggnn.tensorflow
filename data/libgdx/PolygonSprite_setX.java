/**
 * Sets the x position where the sprite will be drawn. If origin, rotation, or scale are changed, it is slightly more efficient
 * to set the position after those operations. If both position and size are to be changed, it is better to use
 * {@link #setBounds(float, float, float, float)}.
 */
public void setX(float x) {
    translateX(x - this.x);
}
