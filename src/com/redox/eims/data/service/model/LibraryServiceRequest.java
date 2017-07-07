package com.redox.eims.data.service.model;

import java.util.List;

public class LibraryServiceRequest {
	private List<Library> library;

	public List<Library> getLibrary() {
		return this.library;
	}

	public void setLibrary(List<Library> library) {
		this.library = library;
	}
}
