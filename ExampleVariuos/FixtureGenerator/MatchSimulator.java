package FixtureGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MatchSimulator {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");
        teams.add("Adana Demir");
        teams.add("Samsunspor");
        teams.add("Karagümrük");
        teams.add("Toprakspor");

        int numTeams = teams.size();
        int numRounds = numTeams - 1;
        int matchesPerRound = numTeams / 2;

        List<Map<String, Integer>> teamPoints = new ArrayList<>();

        // Takımların başlangıç puanlarını 0 olarak ayarla
        for (String team : teams) {
            Map<String, Integer> teamPoint = new HashMap<>();
            teamPoint.put(team, 0);
            teamPoints.add(teamPoint);
        }

        Random random = new Random();

        for (int round = 1; round <= numRounds * 2; round++) {
            System.out.println("Hafta " + round + ":");

            for (int match = 0; match < matchesPerRound; match++) {
                int homeIndex = (round + match) % numTeams;
                int awayIndex = (round + numTeams - 1 - match) % numTeams;

                String homeTeam = teams.get(homeIndex);
                String awayTeam = teams.get(awayIndex);

                while (homeTeam.equals(awayTeam)) {
                    // Aynı takımların eşleşmesini engellemek için farklı bir deplasman takımı seç
                    awayIndex = (awayIndex + 1) % numTeams;
                    awayTeam = teams.get(awayIndex);
                }

                int homeScore = simulateMatch(random);
                int awayScore = simulateMatch(random);

                System.out.println(homeTeam + " " + homeScore + " - " + awayScore + " " + awayTeam);

                // Maç sonucuna göre puanları güncelle
                updatePoints(teamPoints, homeTeam, awayTeam, homeScore, awayScore);
            }

            // Sıralamayı yazdır
            printStandings(teamPoints);
        }
    }

    private static int simulateMatch(Random random) {
        // Maç sonucunu rastgele üret (örneğin, 0 ile 5 arasında rastgele bir skor)
        return random.nextInt(6);
    }

    private static void updatePoints(List<Map<String, Integer>> teamPoints, String homeTeam, String awayTeam,
            int homeScore, int awayScore) {
        for (Map<String, Integer> teamPoint : teamPoints) {
            if (teamPoint != null) {
                if (teamPoint.containsKey(homeTeam)) {
                    int points = teamPoint.get(homeTeam);
                    points += calculatePoints(homeScore, awayScore);
                    teamPoint.put(homeTeam, points);
                }
                if (teamPoint.containsKey(awayTeam)) {
                    int points = teamPoint.get(awayTeam);
                    points += calculatePoints(awayScore, homeScore);
                    teamPoint.put(awayTeam, points);
                }
                if (homeScore == awayScore) {
                    // Berabere durumunda her iki takıma da 1 puan ekleyin
                    if (teamPoint.containsKey(homeTeam)) {
                        teamPoint.put(homeTeam, teamPoint.get(homeTeam));
                    }
                    if (teamPoint.containsKey(awayTeam)) {
                        teamPoint.put(awayTeam, teamPoint.get(awayTeam));
                    }
                }
            }
        }
    }

    private static int calculatePoints(int goalsFor, int goalsAgainst) {
        if (goalsFor > goalsAgainst) {
            return 3; // Galibiyet
        } else if (goalsFor == goalsAgainst) {
            return 1; // Berabere
        } else {
            return 0; // Mağlubiyet
        }
    }

    private static void printStandings(List<Map<String, Integer>> teamPoints) {
        System.out.println("Puan Durumu:");
        teamPoints.sort((team1, team2) -> {
            int points1 = team1.values().iterator().next();
            int points2 = team2.values().iterator().next();
            return Integer.compare(points2, points1);
        });

        int rank = 1;
        for (Map<String, Integer> teamPoint : teamPoints) {
            String team = teamPoint.keySet().iterator().next();
            int points = teamPoint.values().iterator().next();
            System.out.println(rank + ". " + team + ": " + points + " puan");
            rank++;
        }

        System.out.println();
    }
}
