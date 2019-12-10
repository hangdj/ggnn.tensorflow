@Override
public void render() {
    frameBuffer.begin();
    Gdx.gl20.glViewport(0, 0, frameBuffer.getWidth(), frameBuffer.getHeight());
    Gdx.gl20.glClearColor(0f, 1f, 0f, 1);
    Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
    Gdx.gl20.glEnable(GL20.GL_TEXTURE_2D);
    texture.bind();
    meshShader.begin();
    meshShader.setUniformi("u_texture", 0);
    mesh.render(meshShader, GL20.GL_TRIANGLES);
    meshShader.end();
    frameBuffer.end();
    stencilFrameBuffer.begin();
    Gdx.gl20.glViewport(0, 0, frameBuffer.getWidth(), frameBuffer.getHeight());
    Gdx.gl20.glClearColor(1f, 1f, 0f, 1);
    Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_STENCIL_BUFFER_BIT);
    Gdx.gl20.glEnable(GL20.GL_TEXTURE_2D);
    Gdx.gl20.glEnable(GL20.GL_STENCIL_TEST);
    Gdx.gl20.glColorMask(false, false, false, false);
    Gdx.gl20.glDepthMask(false);
    Gdx.gl20.glStencilFunc(GL20.GL_NEVER, 1, 0xFF);
    Gdx.gl20.glStencilOp(GL20.GL_REPLACE, GL20.GL_KEEP, GL20.GL_KEEP);
    Gdx.gl20.glStencilMask(0xFF);
    Gdx.gl20.glClear(GL20.GL_STENCIL_BUFFER_BIT);
    meshShader.begin();
    stencilMesh.render(meshShader, GL20.GL_TRIANGLES);
    meshShader.end();
    Gdx.gl20.glColorMask(true, true, true, true);
    Gdx.gl20.glDepthMask(true);
    Gdx.gl20.glStencilMask(0x00);
    Gdx.gl20.glStencilFunc(GL20.GL_EQUAL, 1, 0xFF);
    meshShader.begin();
    mesh.render(meshShader, GL20.GL_TRIANGLES);
    meshShader.end();
    Gdx.gl20.glDisable(GL20.GL_STENCIL_TEST);
    stencilFrameBuffer.end();
    Gdx.gl20.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    Gdx.gl20.glClearColor(0.2f, 0.2f, 0.2f, 1);
    Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
    spriteBatch.begin();
    spriteBatch.draw(frameBuffer.getColorBufferTexture(), 0, 0, 256, 256, 0, 0, frameBuffer.getColorBufferTexture().getWidth(), frameBuffer.getColorBufferTexture().getHeight(), false, true);
    spriteBatch.draw(stencilFrameBuffer.getColorBufferTexture(), 256, 256, 256, 256, 0, 0, frameBuffer.getColorBufferTexture().getWidth(), frameBuffer.getColorBufferTexture().getHeight(), false, true);
    spriteBatch.end();
}
