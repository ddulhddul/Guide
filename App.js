import React, {Component} from 'react';
import { StyleSheet, Text, View } from 'react-native';

export default class App extends React.Component {
  render() {
    return (
      <View style={styles.app}>
        <NavBar />
        <User />
        <View style={{height:40}}></View>
        <ButtonGroup />
        <View style={{flex:1}}></View>
        <Tabs />
      </View>
    );
  }
}

class NavBar extends Component {
  render() {
    return (
      <View style={{height:60, alignItems:'center', justifyContent:'center'}}>
        <Text>더보기</Text>
      </View>
    );
  }
}
class User extends Component {
  render() {
    return (
      <View style={{height: 200, flexDirection:'row', backgroundColor:'red'}}>
        <View style={{flex:1}}></View>
        <View style={{flex:3, flexDirection:'column'}}>
          <Text>뚫뚤</Text>
          <Text>메롱</Text>
          <Text>하하</Text>
        </View>
      </View>
    );
  }
}
class ButtonGroup extends Component {
  render() {
    return (
      <View style={{height:200, flex:1, flexDirection:'column', backgroundColor:'green'}}>
        <View style={{flexDirection:'row'}}>
          <View style={{flex:1}}><Text>내 계정</Text></View>
          <View style={{flex:1}}><Text>친구</Text></View>
          <View style={{flex:1}}><Text>강의평가</Text></View>
          <View style={{flex:1}}><Text>학점계산기</Text></View>
        </View>
        <View style={{flexDirection:'row'}}>
          <View style={{flex:1}}><Text>쪽지함</Text></View>
          <View style={{flex:1}}><Text>공지사항</Text></View>
          <View style={{flex:1}}><Text>도움말</Text></View>
          <View style={{flex:1}}><Text>앱 설정</Text></View>
        </View>
      </View>
    );
  }
}
class Tabs extends Component {
  render() {
    return (
      <View style={{height: 100, flexDirection:'row', backgroundColor:'yellow'}}>
        <View style={{flex:1}}><Text>홈</Text></View>
        <View style={{flex:1}}><Text>시간표</Text></View>
        <View style={{flex:1}}><Text>커뮤니티</Text></View>
        <View style={{flex:1}}><Text>모임</Text></View>
        <View style={{flex:1}}><Text>더보기</Text></View>
      </View>
    );
  }
}



const styles = StyleSheet.create({
  app: {
    flex: 1,
    flexDirection: 'column'
  },
  container: {
    flex: 1,
    flexDirection: 'row'
  },
  left: {
    flex: 1,
    backgroundColor: 'red'
  },
  right: {
    flex: 1,
    flexDirection: 'column'
  },
  top: {
    flex: 1,
    backgroundColor: 'blue'
  },
  bottom: {
    flex: 2,
    backgroundColor: 'green'
  },
  navBar: {
    height: 50,
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: 'green'
  },
});
