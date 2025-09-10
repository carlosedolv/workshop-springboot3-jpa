package com.carlosedolv.workshop.services.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DatabaseException(Long id) {
		super("Referential integrity constraint violation. Id: " + id);
	}
}
