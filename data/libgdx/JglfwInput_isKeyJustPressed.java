@Override
public boolean isKeyJustPressed(int key) {
    if (key == Input.Keys.ANY_KEY) {
        return keyJustPressed;
    }
    if (key < 0 || key > 256) {
        return false;
    }
    return justPressedKeys[key];
}
