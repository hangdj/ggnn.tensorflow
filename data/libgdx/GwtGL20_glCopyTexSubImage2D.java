@Override
public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
    gl.copyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
}
