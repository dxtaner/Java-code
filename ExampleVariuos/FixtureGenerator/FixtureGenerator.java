package FixtureGenerator;

import java.util.ArrayList;
import java.util.List;

public class FixtureGenerator {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");

        int numTeams = teams.size();

        // Eğer takım sayısı tekse, "Bay" takımını ekleyelim
        if (numTeams % 2 != 0) {
            teams.add("Bay");
            numTeams++;
        }

        int numRounds = numTeams - 1;
        int matchesPerRound = numTeams / 2;

        List<List<String>> fixtures = new ArrayList<>();

        for (int round = 1; round <= numRounds; round++) {
            List<String> roundFixtures = new ArrayList<>();

            for (int match = 0; match < matchesPerRound; match++) {
                int homeIndex = (round + match) % numTeams;
                int awayIndex = (round + numTeams - 1 - match) % numTeams;

                String homeTeam = teams.get(homeIndex);
                String awayTeam = teams.get(awayIndex);

                // Aynı takımların karşılaşmaması ve "Bay" takımının maç yapmaması için kontrol
                // ekleyelim
                if (!homeTeam.equals("Bay") && !awayTeam.equals("Bay")) {
                    if (round <= numRounds / 2) {
                        roundFixtures.add(homeTeam + " (Ev) vs " + awayTeam + " (Deplasman)");
                    } else {
                        roundFixtures.add(awayTeam + " (Ev) vs " + homeTeam + " (Deplasman)");
                    }
                }
            }

            fixtures.add(roundFixtures);
        }

        // Sonuçları yazdır
        int roundNumber = 1;
        for (List<String> roundFixtures : fixtures) {
            System.out.println("Hafta " + roundNumber + " (Birinci Yarı):");
            for (String fixture : roundFixtures) {
                System.out.println(fixture);
            }
            roundNumber++;
        }

        roundNumber = 1;
        for (List<String> roundFixtures : fixtures) {
            System.out.println("Hafta " + roundNumber + " (İkinci Yarı):");
            for (String fixture : roundFixtures) {
                System.out.println(fixture);
            }
            roundNumber++;
        }
    }
}
