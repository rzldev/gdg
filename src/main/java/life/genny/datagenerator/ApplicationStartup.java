package life.genny.datagenerator;


import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApplicationStartup {

    // private static final Logger LOGGER = Logger.getLogger(ApplicationStartup.class);
    // private static final String MELBOURNE_GEO_LOC = "-37.7762758,144.9242811";
    // private static final String NEW_YORK_GEO_LOC = "40.6971477,-74.260556";
    // public static final String LONDON_GEO_LOC = "51.5236688,-1.1831971";

    // @ConfigProperty(name = "data.total_person_tobe_generated", defaultValue = "50")
    // int totalRow;

    // @ConfigProperty(name = "data.generator.max.thread", defaultValue = "5")
    // int maxThread;

    // @ConfigProperty(name = "data.generator.records.per.thread", defaultValue = "100")
    // int perTask;

    // @Inject
    // ObjectMapper objectMapper;
    // @Inject
    // BaseEntityService baseEntityService;
    // @Inject
    // PlaceService placeService;
    // @Inject
    // ImageService imageService;
    // @Inject
    // KeycloakService keycloakService;

    // private final GeneratorUtils generator = new GeneratorUtils();

    // private ExecutorService executor;
    // private List<String> imagesUrl = new ArrayList<>(200);
    // private List<PlaceDetail> places = new ArrayList<>(400);
    // private Date timeStart;
    // private int runnableTotal = 0;
    // private int startId = 1;
    // private int runnableFinished = 0;
    // private int totalThread = 0;
    // private int uThread = 0;
    // private int aThread = 0;
    // private int pThread = 0;
    // private int cThread = 0;

    // @Override
    // public void onFinish(String generatorId) {
    //     runnableFinished++;
    //     if (runnableFinished == runnableTotal && runnableTotal < totalThread)
    //         generateRunnable();
    //     if (runnableFinished == totalThread) {
    //         if (!imagesUrl.isEmpty()) imagesUrl = new ArrayList<>(200);
    //         LOGGER.info("GENERATOR FINISHED: " + (new Date().getTime() - timeStart.getTime()) + "ms");
    //     }
    // }

    // @PostConstruct
    // void setUp() {
    //     timeStart = new Date();
    //     baseEntityService.onStart();
    //     startId = baseEntityService.count();
    //     generator.setObjectMapper(objectMapper);
    //     LOGGER.info("DATA TO GENERATE SIZE:" + totalRow +
    //             ", MAX_THREAD:" + maxThread +
    //             ", PER_THREAD:" + perTask);
    // }

    // void onStart(@Observes StartupEvent event) {
    //     executor = Executors.newFixedThreadPool(maxThread);
    //     int taskPerEntity = Math.min(totalRow, totalRow / perTask);
    //     uThread = taskPerEntity;
    //     pThread = taskPerEntity;
    //     aThread = taskPerEntity;
    //     cThread = taskPerEntity;

    //     totalThread = startId + uThread + pThread + aThread + cThread;
    //     LOGGER.info("creating " + totalThread + " generator tasks");
    //     generateRunnable();

    //     // This operation is for adding a task for each entity if totalRow % perTask != 0
    //     if ((perTask * taskPerEntity) < totalRow) {
    //         uThread += 1;
    //         aThread += 1;
    //         pThread += 1;
    //         int count = totalRow - (perTask * taskPerEntity);
    //         execute(startId, count, runnableFinished);
    //     }
    // }

    // private void generateRunnable() {
    //     int i = runnableFinished;
    //     int threadQueue = totalThread > 2 * maxThread ? 2 * maxThread : totalThread;
    //     while (threadQueue > 0) {
    //         startId += perTask;
    //         execute(startId, perTask, i);
    //         i++;
    //         threadQueue--;
    //     }
    // }

    // private void fetchPlaces() {
    //     LOGGER.info("FETCHING PLACES");
    //     int radius = 100000;
    //     places.addAll(placeService.fetchRandomPlaces(MELBOURNE_GEO_LOC, String.valueOf(radius)));
    //     places.addAll(placeService.fetchRandomPlaces(NEW_YORK_GEO_LOC, String.valueOf(radius)));
    //     places.addAll(placeService.fetchRandomPlaces(LONDON_GEO_LOC, String.valueOf(radius)));
    //     LOGGER.debug(places.size() + " places fetched.");
    // }

    // private void fetchImages() {
    //     LOGGER.info("FETCHING IMAGES");
    //     imagesUrl = imageService.fetchImages();
    // }

    // private void execute(int startId, int count, int i) {
    //     try {
    //         runnableTotal++;

    //         if (pThread > 0) {
    //             executor.submit(new PersonGenerator(startId, count, baseEntityService, this, i + ""));
    //             pThread--;
    //             return;
    //         }

    //         if (aThread > 0) {
    //             if (places.isEmpty()) fetchPlaces();
    //             executor.submit(new AddressGenerator(startId, count, baseEntityService, this, i + "", places));
    //             aThread--;
    //             return;
    //         }
    //         if (!places.isEmpty()) places = new ArrayList<>(400);

    //         if (cThread > 0) {
    //             executor.submit(new ContactGenerator(startId, count, baseEntityService, this, i + ""));
    //             cThread--;
    //             return;
    //         }

    //         if (imagesUrl.isEmpty()) fetchImages();
    //         executor.submit(new UserGenerator(startId, count, baseEntityService, this, i + "", imagesUrl, keycloakService));
    //         uThread--;
    //     } catch (Exception e) {
    //         LOGGER.error(e.getMessage(), e);
    //     }
    // }
}
