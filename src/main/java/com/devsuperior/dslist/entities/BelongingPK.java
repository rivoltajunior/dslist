package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {

	
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Games games;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private GamesList list;
	
	public BelongingPK() {
	}

	public BelongingPK(Games games, GamesList list) {
		super();
		this.games = games;
		this.list = list;
	}

	public Games getGames() {
		return games;
	}

	public void setGames(Games games) {
		this.games = games;
	}

	public GamesList getList() {
		return list;
	}

	public void setList(GamesList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(games, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(games, other.games) && Objects.equals(list, other.list);
	}
}


