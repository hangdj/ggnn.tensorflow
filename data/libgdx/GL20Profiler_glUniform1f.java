@Override
public void glUniform1f(int location, float x) {
    calls++;
    gl20.glUniform1f(location, x);
    check();
}
