Jeg lagde en ny repository i github og lastet opp oblig 2 prosjekten.
Etter det så lagde test.yml for å få git actions til å kjøre for hver gang når jeg commit og push-er til main (on: push: branch main) og når det skjer en pull request (on: pull_request: branch main).

Jeg bruker ubuntu for å kjøre test.yml og satt opp riktig JDK og java versjon, etter det så kjører jeg "mvn -B package --file pom.xml" sånn at ubuntu bygger opp riktig dependencies ut ifra min pom.xml, også kjører den testene (LeapYearTest) før den kan fullføre action
