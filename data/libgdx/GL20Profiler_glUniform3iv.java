@Override
public void glUniform3iv(int location, int count, int[] v, int offset) {
    calls++;
    gl20.glUniform3iv(location, count, v, offset);
    check();
}