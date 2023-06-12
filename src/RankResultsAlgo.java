class RankResultsAlgo {
    String reward = "";
    private int total_score;

    public String[] results_scores(int kernel, int process_management, int io_management, int file_managment, int storage_management, int memory_management, int protection, int command_interpreter) {

        String kernel_reward, pm_reward, io_reward, fm_reward, sm_reward, mem_reward, protection_reward, command_reward;
        // int total_score = kernel + process_management + io_management + file_managment + storage_management + memory_management + protection + command_interpreter;
        //kernel processing
        int indiv_score = 0;
         switch(MainMenu.difficulty.diff_level){

            case 1:
            indiv_score = 30;
            break;

            case 2:
            indiv_score = 60;
            break;

            case 3:
            indiv_score = 90;
            break;
        }
        double max_score = MainMenu.difficulty.diff_level;
        kernel_reward = processKernel((kernel/indiv_score)*100);
        pm_reward = processPM((process_management / indiv_score) * 100);  
        io_reward = processIO((io_management/indiv_score)*100);
        fm_reward = processFM((file_managment/indiv_score)*100);
        sm_reward = processSM((storage_management/indiv_score)*100);
        mem_reward = processMEM((memory_management/indiv_score)*100);
        protection_reward = processPR((protection/indiv_score)*100);
        command_reward = processCI((command_interpreter/indiv_score)*100);
        System.out.println("diff level" + MainMenu.difficulty.diff_level);
        String [] data = {kernel_reward, pm_reward, io_reward, fm_reward, sm_reward, mem_reward, protection_reward, command_reward};
        total_score = MainMenu.question.points;
        setTotalScore(MainMenu.question.points);


        switch(MainMenu.difficulty.diff_level){

            case 1:
            max_score = 240.0;
            break;

            case 2:
            max_score = 480.0;
            break;

            case 3:
            max_score = 720.0;
            break;
        }
        System.out.println("Total: " + total_score);
        double rating = ((double) (getTotalScore() / max_score) * 100) ;
        System.out.println((int)rating);
        OSCreate.mainMenu.results.results_score_label.setText(String.valueOf((int)rating)+"%");
        return data;

        
        // System.out.println("You Got " + "\n" + 
        // "Kernel: " + kernel_reward + "\n" +
        // "Process Management: " + pm_reward + "\n"+
        // "I/O Management: " + io_reward + "\n" +
        // "File Management: " + fm_reward + "\n" +
        // "Storage Management: " + sm_reward + "\n" +
        // "Memory Management: " + mem_reward + "\n" +
        // "Protection: " + protection_reward + "\n" +
        // "Command Interpreter: " + command_reward + "\n" + 
        // "Total Points: " + total_score
        // );
    }

    public void setTotalScore(int total_score) {
        this.total_score = total_score;
    }

    public int getTotalScore(){
        return this.total_score;
    }

  

    //kernel
    private String processKernel(int score) {

        if(score >= 0 && score < 25){
            reward = "Monolithic Kernel";
        }
        else if(score >= 25 && score < 50){
            reward = "Layered kernel";
        }
        else if(score >= 50 && score < 75){
            reward = "Microkernel";
        }
        else if(score >= 75 && score <= 100){
            reward = "Graph kernel";
        }
        return reward;
    }

    //process management
    private String processPM(int score) {

        if(score >= 0 && score < 25){
            reward = "Batch processing";
        }
        else if(score >= 25 && score < 50){
            reward = "Time Sharing";
        }
        else if(score >= 50 && score < 75){
            reward = "Multilevel Feedback Queues";
        }
        else if(score >= 75 && score <= 100){
            reward = "Completely Fair Scheduler";
        }
        return reward;
    }

    //file management
    private String processFM(int score) {

        if(score >= 0 && score < 25){
            reward = "Direct File Access";
        }
        else if(score >= 25 && score < 50){
            reward = "File Directories";
        }
        else if(score >= 50 && score < 75){
            reward = "Flat-file storage";
        }
        else if(score >= 75 && score <= 100){
            reward = "COM Structured Storage";
        }
        return reward;
    }

    //IO
    private String processIO(int score) {
        
        if(score >= 0 && score < 25){
            reward = "IO Sync by Interlock";
        }
        else if(score >= 25 && score < 50){
            reward = "IO Polling";
        }
        else if(score >= 50 && score < 75){
            reward = "Interrupt-Driven IO";
        }
        else if(score >= 75 && score <= 100){
            reward = "IO Controllers";
        }
        return reward;
    }

    //Storage Management
    private String processSM(int score) {

        if(score >= 0 && score < 25){
            reward = "Direct Mapping";
        }
        else if(score >= 25 && score < 50){
            reward = "Memory Virtualization";
        }
        else if(score >= 50 && score < 75){
            reward = "Memory Controllers";
        }
        else if(score >= 75 && score <= 100){
            reward = "Dynamic Memory Management";
        }
        return reward;
    }

    //Memory Management
    private String processMEM(int score) {

        if(score >= 0 && score < 25){
            reward = "Checks and Bounds";
        }
        else if(score >= 25 && score < 50){
            reward = "Segmentation";
        }
        else if(score >= 50 && score < 75){
            reward = "Paging";
        }
        else if(score >= 75 && score <= 100){
            reward = "Segmented Paging";
        }
        return reward;
    }

    //Protection
    private String processPR(int score) {

        if(score >= 0 && score < 25){
            reward = "Access Control Bits";
        }
        else if(score >= 25 && score < 50){
            reward = "Encryption";
        }
        else if(score >= 50 && score < 75){
            reward = "User Authentication";
        }
        else if(score >= 75 && score <= 100){
            reward = "Firewalls";
        }
        return reward;
    }

    //Command Interpreter
    private String processCI(int score) {

        if(score >= 0 && score < 25){
            reward = "Simple Interpreter";
        }
        else if(score >= 25 && score < 50){
            reward = "Self-interpreter";
        }
        else if(score >= 50 && score < 75){
            reward = "Bytecode Interpreter";
        }
        else if(score >= 75 && score <= 100){
            reward = "Template Interpreter";
        }
        return reward;
    }
}