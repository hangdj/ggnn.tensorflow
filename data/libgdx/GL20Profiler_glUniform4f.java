@Override
public void glUniform4f(int location, float x, float y, float z, float w) {
    calls++;
    gl20.glUniform4f(location, x, y, z, w);
    check();
}
