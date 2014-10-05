package com.pi.e_voting.services;

import javax.ejb.Local;

import com.pi.e_voting.entities.Ballot;

@Local
public interface LocalServiceClasse {
	public void SetElectionSession(Ballot ballot);
	public void FindSessionByName(String name);
	public int SessionState(String name);
	public void CloseSession(String name);
	public void StartCount(String name);
}
