@Override
public void render() {
    Gdx.gl.glClearColor(0, 1, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    spriteBatch.begin();
    logoSprite.draw(spriteBatch);
    spriteBatch.end();
}
