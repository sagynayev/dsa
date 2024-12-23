package Edu;

import java.util.ArrayList;
import java.util.List;

import Interfaces.Researcher;

public class ResearchProject {
	private String topic;
    private List<Researcher> participants;
    private List<ResearchPaper> publishedPapers;

    public ResearchProject(String topic) {
        this.topic = topic;
        this.participants = new ArrayList<>();
        this.publishedPapers = new ArrayList<>();
    }
    public void addParticipant(Researcher researcher) {
        participants.add(researcher);
        System.out.println("Added participant: " + researcher);
    }

    public void addPublishedPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
        System.out.println("Added research paper: " + paper);
    }
    public void viewParticipants() {
        System.out.println("Participants in project \"" + topic + "\":");
        for (Researcher participant : participants) {
            System.out.println(participant);
        }
    }
    public void viewPublishedPapers() {
        System.out.println("Published Papers in project \"" + topic + "\":");
        for (ResearchPaper paper : publishedPapers) {
            System.out.println(paper);
        }
    }
}

