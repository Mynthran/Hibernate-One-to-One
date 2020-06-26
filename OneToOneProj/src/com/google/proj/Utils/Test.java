package com.google.proj.Utils;

import com.google.proj.DAO.teamDAO;
import com.google.proj.DTO.Team;
import com.google.proj.DTO.TeamLeader;

public class Test
{
	public static void main(String[] args) 
	{
		TeamLeader leader = new TeamLeader();
		leader.setName("kcm");
		leader.setAge(24);
		
		Team team = new Team();
		team.setTeamName("BruttalBullzzz");
		team.setNoOfPlayers(15);
		team.setNationality("India");
		team.setLeader(leader);
		
		teamDAO dao = new teamDAO();
		dao.saveTeam(team);
	}
}
