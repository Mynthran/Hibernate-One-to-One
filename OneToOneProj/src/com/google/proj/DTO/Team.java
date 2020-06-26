package com.google.proj.DTO;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "team")
public class Team implements Serializable
{
		@Id
		@GenericGenerator(name = "t_auto", strategy = "increment")
		@GeneratedValue(generator = "t_auto")
		@Column(name = "t_id")
		private int id;
		
		@Column(name = "t_name")
		private String teamName;
		
		@Column(name = "t_noOfPlayers")
		private int noOfPlayers;
		
		@Column(name = "t_nationality")
		private String nationality;
		
		@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
		@JoinColumn(name = "l_fk")
		private TeamLeader leader;

		public Team() {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTeamName() {
			return teamName;
		}

		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}

		public int getNoOfPlayers() {
			return noOfPlayers;
		}

		public void setNoOfPlayers(int noOfPlayers) {
			this.noOfPlayers = noOfPlayers;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		

		public TeamLeader getLeader() {
			return leader;
		}

		public void setLeader(TeamLeader leader) {
			this.leader = leader;
		}

		@Override
		public String toString() {
			return "Team [id=" + id + ", teamName=" + teamName + ", noOfPlayers=" + noOfPlayers + ", nationality="
					+ nationality + ", leader=" + leader + "]";
		}
		
		
}
