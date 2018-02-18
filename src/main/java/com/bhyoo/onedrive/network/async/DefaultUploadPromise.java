package com.bhyoo.onedrive.network.async;

import com.bhyoo.onedrive.container.items.FileItem;
import io.netty.util.concurrent.DefaultPromise;
import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URI;
import java.nio.file.Path;

/**
 * @author <a href="mailto:bh322yoo@gmail.com" target="_top">isac322</a>
 */
public class DefaultUploadPromise extends DefaultPromise<FileItem> implements UploadPromise {
	@NotNull private final Path filePath;
	@Nullable private URI uploadURI;


	public DefaultUploadPromise(EventExecutor executor, @NotNull Path filePath) {
		super(executor);
		this.filePath = filePath;
	}

	@Override public @NotNull Path filePath() {
		return filePath;
	}

	@Override public @Nullable URI uploadURI() {
		return uploadURI;
	}

	@Override public @NotNull UploadPromise setUploadURI(@NotNull URI uri) {
		this.uploadURI = uri;
		return this;
	}


	@Override public DefaultUploadPromise setSuccess(FileItem result) {
		super.setSuccess(result);
		return this;
	}

	@Override public DefaultUploadPromise setFailure(Throwable cause) {
		super.setFailure(cause);
		return this;
	}

	@Override
	public DefaultUploadPromise addListener(GenericFutureListener<? extends Future<? super FileItem>> listener) {
		super.addListener(listener);
		return this;
	}

	@Override
	public DefaultUploadPromise addListeners(GenericFutureListener<? extends Future<? super FileItem>>[] listeners) {
		super.addListeners(listeners);
		return this;
	}

	@Override
	public DefaultUploadPromise removeListener(GenericFutureListener<? extends Future<? super FileItem>> listener) {
		super.removeListener(listener);
		return this;
	}

	@Override
	public DefaultUploadPromise removeListeners(
			GenericFutureListener<? extends Future<? super FileItem>>[] listeners) {
		super.removeListeners(listeners);
		return this;
	}

	@Override public DefaultUploadPromise await() throws InterruptedException {
		super.await();
		return this;
	}

	@Override public DefaultUploadPromise awaitUninterruptibly() {
		super.awaitUninterruptibly();
		return this;
	}

	@Override public DefaultUploadPromise sync() throws InterruptedException {
		super.sync();
		return this;
	}

	@Override public DefaultUploadPromise syncUninterruptibly() {
		super.syncUninterruptibly();
		return this;
	}
}
