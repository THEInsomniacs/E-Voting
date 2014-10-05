package com.pi.e_voting.services;

import javax.ejb.Remote;

import com.pi.e_voting.entities.Ballot;

@Remote
public interface RemoteServiceClasse {
	
	public void SetElectionSession(Ballot ballot);
	public void FindSessionByName(String name);
	public int SessionState(String name);
	public void CloseSession(String name);
	public void StartCount(String name);

}
