package ru.yandex.incoming34;

import java.util.UUID;

public class Element {

	private final UUID uuid;
	private String payload;
	private UUID previousElementUuid;
	private UUID nextElementUuid;

	public Element(UUID uuid) {
		super();
		this.uuid = uuid;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public UUID getPreviousElementUuid() {
		return previousElementUuid;
	}

	public void setPreviousElementUuid(UUID previousElementUuid) {
		this.previousElementUuid = previousElementUuid;
	}

	public UUID getNextElementUuid() {
		return nextElementUuid;
	}

	public void setNextElementUuid(UUID nextElementUuid) {
		this.nextElementUuid = nextElementUuid;
	}

	public UUID getUuid() {
		return uuid;
	}

}
