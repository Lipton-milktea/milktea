
public class MainFrame extends JFrame{
    public String[] PanelNames = {"main","register","edit"};//���̖��O�Ńp�l���̎w�������
//
    //�e��p�l�����쐬
    MainPanel mainPanel = new MainPanel(this,PanelNames[0]);
    TaskRegisterPanel taskRegisterPanel = new TaskRegisterPanel(this,PanelNames[1]);
    TaskEditPanel taskEditPanel = new TaskEditPanel(this,PanelNames[2]);

    public MainFrame(){
        this.add(mainPanel);
        mainPanel.setVisible(true);

        this.add(taskRegisterPanel);
        taskRegisterPanel.setVisible(false);

        this.add(taskEditPanel);
        taskEditPanel.setVisible(false);

        this.setBounds(100, 100, 1200, 800);
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    //�y�[�W�̍ĕ`��p
    //mainPanel�͂�������Ȃ��ƕύX���\���ɔ��f����Ȃ�
    //�ꉞ���̓�̃p�l�������c
    public void reloadPage(String reloadPanelName){
        if(reloadPanelName == PanelNames[0]){
            this.remove(this.mainPanel);
            MainPanel mainPanel = new MainPanel(this,PanelNames[0]);
            this.add(mainPanel);
        }
        else if(reloadPanelName == PanelNames[1]){
            this.remove(this.taskRegisterPanel);
            TaskRegisterPanel taskRegisterPanel = new TaskRegisterPanel(this,PanelNames[1]);
            this.add(taskRegisterPanel);
        }
        else if(reloadPanelName == PanelNames[2]){
            this.remove(this.taskEditPanel);
            TaskEditPanel taskEditPanel = new TaskEditPanel(this,PanelNames[2]);
            this.add(taskEditPanel);
        }
    }

    //�p�l���J�ڃ��\�b�h
    //���炩���ߑS�p�l�����쐬���ĕ\���A��\����؂�ւ������

    //���C���p�l����\��
    public void showMainPanel(JPanel nowPanel){
        nowPanel.setVisible(false);
        mainPanel.setVisible(true);
    }

    //�^�X�N�o�^�p�l����\��
    public void showRegisterPanel(JPanel nowPanel){
        nowPanel.setVisible(false);
        taskRegisterPanel.setVisible(true);
    }

    //�^�X�N�ҏW�p�l����\��
    public void showEditPanel(JPanel nowPanel, TaskDto task){
        nowPanel.setVisible(false);
        //�����������ݒ�
        taskEditPanel.setEditString(task);
        taskEditPanel.setVisible(true);
    }
}